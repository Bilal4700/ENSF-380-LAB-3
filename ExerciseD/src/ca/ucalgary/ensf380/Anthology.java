package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    private Story[] stories;

    public Anthology() {
        super();
    }

    public Anthology(String isbn, int pages) {
        super();
    }

    public String storyOrder() {
        return "Method storyOrder called from Anthology";
    }

    public Story[] getStory() {
        return stories;
    }

    public void setStory(Story[] stories) {
        this.stories = stories;
    }
}
