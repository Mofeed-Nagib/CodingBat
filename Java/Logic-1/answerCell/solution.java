public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    return !(isMorning && !isMom || isAsleep);
}