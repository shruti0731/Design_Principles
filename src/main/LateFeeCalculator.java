package main;

public class LateFeeCalculator {
    /*
     * Logic to calculate late fees
     */
    public double calculateTotalLateFees(LateFeeCalculate[] items, int daysLate) {
        double totalLateFees = 0;
        for (LateFeeCalculate item : items) {
            totalLateFees += item.calculateLateFee(daysLate);
        }
        return totalLateFees;
    }}
