public class BaseAdvertising {
    private int clicks;
    private int views;

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getViews() {
        return views;
    }

    public int getClicks() {
        return clicks;
    }

    public void incClick(){
        setClicks(getClicks()+1);
    }
    public void incViews(){
        setViews(getViews() + 1);
    }

    public String describeMe(){
        return "This is Base class.";
    }
}
