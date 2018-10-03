package singleton;

public class Asset {

    private static Asset asset;// = new Asset();

    private Asset(){
        //...constuctor
    }

    public static Asset getAsset() {
        if(asset == null){
            asset = new Asset();//延缓加载
        }//时间更快，只有用的时候才调用
        return asset;
    }
}
