package reports.searched.part.model;

public class DTOwithSum {
    PartForReportDTO part;
    String sum;

    public PartForReportDTO getPart() {
        return part;
    }

    public void setPart(PartForReportDTO part) {
        this.part = part;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public DTOwithSum(PartForReportDTO part, String sum) {
        this.part = part;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "DTOwithSum{" +
                "part=" + part +
                ", sum=" + sum +
                '}';
    }
}
