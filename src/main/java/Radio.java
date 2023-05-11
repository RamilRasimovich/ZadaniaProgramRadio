public class Radio {
    private int currentStation;
    private int currentVolume;

    public int  next () {
        if (currentStation != 9) {
            currentStation++;
            else 
            return;
        }
        currentStation = 0;
    }

    public int getCurrentStation() {
        return  currentStation;
    }

    public int setCurrentStation(int currentStation) {
        if (currentStation < 0 ){
            return;
        }
        if (currentStation > 9 ){
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 ){
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
    }
}
