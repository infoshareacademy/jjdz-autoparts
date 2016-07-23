package searched.part;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Test;
import org.junit.runner.RunWith;
import reports.searched.part.GetSearchedPart;
import reports.searched.part.MostFrequentlySearchedParts;
import reports.searched.part.StorePart;
import reports.searched.part.model.*;

import javax.ejb.EJB;
import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Arquillian.class)
public class MostFrequentlySearchedPartsIT{

    @Deployment
    public static WebArchive deployment() {

        File[] libs = Maven.resolver()
                .resolve("org.apache.logging.log4j:log4j-core:2.5",
                        "org.apache.logging.log4j:log4j-api:2.5")
                .withTransitivity()
                .asFile();

        return ShrinkWrap.create(WebArchive.class)
                .addAsLibraries(libs)
                .addAsResource("test-persistence.xml", "META-INF/persistence.xml")
                // .addAsResource("log4j2.xml", "log4j2.xml")
                .addClass(MostFrequentlySearchedParts.class)
                .addClass(StorePart.class)
                .addClass(PartForReportModule.class)
                .addClass(PartForReportModuleBuilder.class)
                .addClass(PartForReportDTO.class)
                .addClass(PartForReportDTOBuilder.class)
                .addClass(DTOwithSum.class)
                .addClass(DataSavedToDB.class)
                .addClass(DataSavedToDBBuilder.class)
                .addClass(GetSearchedPart.class);
    }

    @EJB
    MostFrequentlySearchedParts parts;

    @EJB
    StorePart storePart;

    @Test
    public void should_return_list() throws Exception {
        //given
        PartForReportModule part1 = new PartForReportModuleBuilder()
                .setCarBrand("carBrand")
                .setCarEngine("engine")
                .setCarModel("carModel")
                .setDateTime(LocalDateTime.of(2016,07,15,00,00,00))
                .setPartBrand("partBrand")
                .setPartId("123")
                .setPartName("partName")
                .setToken("autoparts")
                .setUserId("88")
                .setUserName("Wiesiek Wszywka")
                .setWeight(0.2f)
                .build();
        PartForReportModule part2 = new PartForReportModuleBuilder()
                .setCarBrand("opel")
                .setCarEngine("dti")
                .setCarModel("astra")
                .setDateTime(LocalDateTime.of(2016,07,15,00,00,00))
                .setPartBrand("bosch")
                .setPartId("123")
                .setPartName("wycieracki")
                .setToken("autoparts")
                .setUserId("88")
                .setUserName("Wiesiek Wszywka")
                .setWeight(0.5f)
                .build();

        storePart.save(part1);
        storePart.save(part2);

        List<DTOwithSum> partsForReport = parts.getPartsForReport(LocalDateTime.of(2016, 07, 14, 00, 00, 00), LocalDateTime.of(2016, 07, 15, 01, 00, 00));

        assertThat(partsForReport.size(), is(2));
        assertThat(partsForReport.get(0).getPart().getCarBrand(),is("opel"));
        assertThat(partsForReport.get(1).getPart().getPartName(),is("partName"));
    }

}