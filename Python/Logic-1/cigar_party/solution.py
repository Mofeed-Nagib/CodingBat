def cigar_party(cigars, is_weekend):
    return cigars >= 40 and (is_weekend or not is_weekend and cigars <= 60)