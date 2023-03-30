public class HolidaysList {
    private Holiday[] list;

    public HolidaysList(Holiday[] list) {
        this.list = list;
    }

    public Holiday[] getList() {
        return list;
    }

    public String isHoliday(String date) {
        for (int i = 0; i < list.length; i++) {
            if (date.equals(list[i].getDate())) {
                return list[i].getName();
            }
        }
        return "This date is not a holiday.";
    }
}
