public boolean cigarParty(int cigars, boolean isWeekend) {
    return cigars >= 40 && (isWeekend || !isWeekend && cigars <= 60);
}