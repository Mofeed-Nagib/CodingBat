def squirrel_play(temp, is_summer):
    return temp >= 60 and (is_summer and temp <= 100 or not is_summer and temp <= 90)