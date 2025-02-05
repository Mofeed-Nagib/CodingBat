def not_string(str):
    return str if len(str) >= 3 and str[:3] == "not" else "not " + str
