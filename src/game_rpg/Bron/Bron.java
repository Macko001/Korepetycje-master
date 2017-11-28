package game_rpg.Bron;

/**
 *  *  Cechy broni
 *      - broń zwiększa punkty ataku
 *      - zwiększa albo zmniejsza zręczność
 *      - broń zadaje obrażenia
 *  -------------------
 */
public abstract class Bron {
    protected int punktyAtaku;
    protected int ciezarBroni;

    public int getPunktyAtaku() {
        return punktyAtaku;
    }

    public void setPunktyAtaku(int punktyAtaku) {
        this.punktyAtaku = punktyAtaku;
    }

    public int getCiezarBroni() {
        return ciezarBroni;
    }

    public void setCiezarBroni(int ciezarBroni) {
        this.ciezarBroni = ciezarBroni;
    }
}
