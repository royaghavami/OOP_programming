public class Ad extends BaseAdvertising{
    private String id;
    private String title;
    private String imgUrl;
    private String link;
    private Advertiser advertiser;

    public Ad(String id, String title, String imgUrl, String link, Advertiser advertiser) {
        this.id = id;
        this.title = title;
        this.imgUrl = imgUrl;
        this.link = link;
        this.advertiser = advertiser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    public String describeMe(){
        return "This is Ad class.";
    }

    @Override
    public void incClick(){
        setClicks(getClicks()+1);
        advertiser.incClick();
    }

    @Override
    public void incViews(){
        setViews(getViews() + 1);
        advertiser.incViews();
    }

}
