package searched.part;

import org.junit.Test;
import reports.searched.part.MostFrequentlySearchedParts;
import reports.searched.part.StorePart;
import reports.searched.part.model.DTOwithSum;
import reports.searched.part.model.PartForReportModule;
import reports.searched.part.model.PartForReportModuleBuilder;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MostFrequentlySearchedPartsIT{

    @Test
    public void should_return_list() throws Exception {
        //given
        PartForReportModule parts = new PartForReportModuleBuilder()
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

        StorePart storePart = new StorePart();
        storePart.save(parts);
        storePart.save(part2);

        MostFrequentlySearchedParts searchedParts = new MostFrequentlySearchedParts();
        List<DTOwithSum> partsForReport = searchedParts.getPartsForReport(LocalDateTime.of(2016, 07, 14, 00, 00, 00), LocalDateTime.of(2016, 07, 15, 01, 00, 00));

        assertThat(partsForReport.size(), is(2));
        assertThat(partsForReport.get(0).getSum(),is(0.5f));
        assertThat(partsForReport.get(0).getSum(),is(0.2f));
    }

}