package jebl.evolution.align.scores;

public class Pam110 extends AminoAcidScores {

  private final float[][] residueScores = {

            /*  A   R   N   D   C   Q   E   G   H   I   L   K   M   F   P   S   T   W   Y   V */
            {   3},
            {  -3,  7},
            {  -1, -1,  4},
            {  -1, -4,  2,  5},
            {  -3, -4, -5, -7,  9},
            {  -1,  1,  0,  1, -7,  6},
            {   0, -3,  1,  4, -7,  2,  5},
            {   1, -4,  0,  0, -5, -3, -1,  5},
            {  -3,  1,  2,  0, -4,  3, -1, -4,  7},
            {  -1, -3, -2, -3, -3, -3, -3, -4, -4,  6},
            {  -3, -4, -4, -6, -8, -2, -5, -6, -3,  1,  6},
            {  -3,  2,  1, -1, -7,  0, -1, -3, -2, -3, -4,  5},
            {  -2, -1, -3, -5, -7, -1, -3, -4, -4,  1,  3,  0,  8},
            {  -4, -5, -4, -7, -6, -6, -7, -5, -3,  0,  0, -7, -1,  8},
            {   1, -1, -2, -3, -4,  0, -2, -2, -1, -4, -4, -3, -4, -6,  6},
            {   1, -1,  1, -1, -1, -2, -1,  0, -2, -3, -4, -1, -2, -4,  0,  3},
            {   1, -2,  0, -1, -3, -2, -2, -2, -3,  0, -3, -1, -1, -4, -1,  2,  5},
            {  -7,  1, -5, -8, -9, -6, -9, -8, -4, -7, -3, -5, -6, -1, -7, -3, -6, 12},
            {  -4, -5, -2, -5, -1, -6, -5, -7, -1, -2, -3, -5, -5,  4, -7, -3, -3, -2,  8},
            {   0, -4, -3, -4, -3, -3, -3, -2, -3,  3,  1, -4,  1, -3, -2, -2,  0, -8, -4,  5}};

  public Pam110() { buildScores(residueScores); }
}