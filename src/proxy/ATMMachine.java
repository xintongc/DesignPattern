package proxy;

public class ATMMachine implements GetATMData {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {
//        hasCard = new HasCard(this);
//        noCard = new NoCard(this);
//        hasCorrectPin = new HasPin(this);
//        atmOutOfMoney = new NoCard(this);

        atmState = noCard;
        if(cashInMachine < 0){
            System.out.println("Out of Money");
        }
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public void setHasCard(ATMState hasCard) {
        this.hasCard = hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public void setNoCard(ATMState noCard) {
        this.noCard = noCard;
    }

    public ATMState getHasCorrectPin() {
        return hasCorrectPin;
    }

    public void setHasCorrectPin(ATMState hasCorrectPin) {
        this.hasCorrectPin = hasCorrectPin;
    }

    public ATMState getAtmOutOfMoney() {
        return atmOutOfMoney;
    }

    public void setAtmOutOfMoney(ATMState atmOutOfMoney) {
        this.atmOutOfMoney = atmOutOfMoney;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public boolean isCorrectPinEntered() {
        return correctPinEntered;
    }

    public void setCorrectPinEntered(boolean correctPinEntered) {
        this.correctPinEntered = correctPinEntered;
    }

    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasCorrectPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }


        // NEW STUFF

    public ATMState getATMState() { return atmState; }

    public int getCashInMachine() { return cashInMachine; }

}
