public class Main {
    public static void main(String[] args) {
        BaseAdvertising baseAdvertising = new BaseAdvertising();
        Advertiser advertiser1 = new Advertiser(1, "name1");
        Advertiser advertiser2 = new Advertiser(2, "name2");

        Ad ad1 = new Ad("1", "title1", "img_url1", "link1", advertiser1);
        Ad ad2 = new Ad("2", "title2", "img_url2", "link2", advertiser2);
       System.out.println(baseAdvertising.describeMe());
        System.out.println(ad2.describeMe());
        System.out.println(advertiser1.describeMe());
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();

        ad2.incViews();

        ad1.incClick();
        ad2.incClick();
        System.out.println(advertiser2.getName());
        advertiser2.setName("new name");
        System.out.println(advertiser2.getName());

        System.out.println(ad1.getClicks());
        System.out.println(advertiser2.getViews());
        System.out.println(Advertiser.getTotalClicks());
        System.out.println(Advertiser.help());

    }
}
