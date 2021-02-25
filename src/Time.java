public class Time {
    int maxDay;
    int monthDisplay;
    int yearDisplay;
    int dayDisplay;
    int maxMonth = 12;


    public void nextDay(int dayInput, int monthInput, int yearsInput) {
        //Kiem tra nam nhuan neee
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = yearsInput % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = yearsInput % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = yearsInput % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
//1 thang co toi  da bao nhiu ngay
        switch (monthInput) {
            case 1:
                this.maxDay = 31;
            case 3:
                this.maxDay = 31;
            case 5:
                this.maxDay = 31;
            case 7:
                this.maxDay = 31;
            case 8:
                this.maxDay = 31;
            case 10:
                this.maxDay = 31;
            case 12:
                this.maxDay = 31;
                break;
            case 2:
                if (isLeapYear) {
                    this.maxDay = 29;
                } else {this.maxDay = 28;
                }
                break;
            case 4:
                this.maxDay = 30;
            case 6:
                this.maxDay = 30;
            case 9:
                this.maxDay = 30;
            case 11:
                this.maxDay = 30;

        }
        //Tim ngay tiep  theo
        if (dayInput < this.maxDay) {
            this.dayDisplay = dayInput + 1;
            this.monthDisplay = monthInput;
            this.yearDisplay = yearsInput;
        } else {
            this.dayDisplay = 1;
            this.monthDisplay = monthInput+1;
            this.yearDisplay = yearsInput;
            if ( this.maxMonth<this.monthDisplay) {
                this.monthDisplay = 1;
                this.yearDisplay =yearsInput +1;
            }
        }
    }

    public int getDay() {
        return this.maxDay;
    }

    @Override
    public String toString() {
        return "Time{" +
                ", dayDisplay= " + this.dayDisplay +
                ", monthDisplay= " + monthDisplay +
                ", yearDisplay= " + yearDisplay +


                '}';
    }
}
