package com.example.policeapp.Model;

public class CrimeCounter {
    private int vandalism;
    private int eveTeasing;
    private int pickPocketing;
    private int chainSnatching;

    public CrimeCounter() {
        this.vandalism = 0;
        this.eveTeasing = 0;
        this.pickPocketing = 0;
        this.chainSnatching = 0;
    }

    public void reportCrime(String crimeType) {
        switch (crimeType) {
            case "Vandalism":
                vandalism++;
                break;
            case "Eve Teasing":
                eveTeasing++;
                break;
            case "Pick Pocketing":
                pickPocketing++;
                break;
            case "Chain Snatching":
                chainSnatching++;
                break;
        }
    }

    public int getVandalism() { return vandalism; }
    public int getEveTeasing() { return eveTeasing; }
    public int getPickPocketing() { return pickPocketing; }
    public int getChainSnatching() { return chainSnatching; }
}
