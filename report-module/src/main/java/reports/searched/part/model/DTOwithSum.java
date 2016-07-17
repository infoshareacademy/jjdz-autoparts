package reports.searched.part.model;

public class DTOwithSum {
    PartForReportDTO part;
    double sum;

    public PartForReportDTO getPart() {
        return part;
    }

    public void setPart(PartForReportDTO part) {
        this.part = part;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public DTOwithSum(PartForReportDTO part, double sum) {
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
