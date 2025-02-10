public String alarmClock(int day, boolean vacation) {
    if (1 <= day && day <= 5 && !vacation) {
        return "7:00";
    }
    else if (1 <= day && day <= 5 && vacation || (day == 0 || day == 6) && !vacation) {
        return "10:00";
    }
    else {
        return "off";
    }
}