package ca.ucalgary.ensf380;

public class Fiction extends Paperback {
    @Override
    public String coverArt() {
        return "Method coverArt called from Fiction";
    }

    public String genre() {
        return "Method genre called from Fiction";
    }
}