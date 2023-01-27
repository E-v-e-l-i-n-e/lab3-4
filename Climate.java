package objects;


public enum Climate {
    HOT("Здесь слишком жарко.", false),
    STUFFY("Здесь очень душно.", false),
    COLD("Здесь невероятно холодно.", false),
    DIRTY("Здесь слишком грязно.", false);
    final String climate;
    final boolean isSuitable;
    Climate(String climate, boolean isSuitable){
        this.climate = climate;
        this.isSuitable = isSuitable;
    }


    public boolean isSuitableForLiving() {
        return this.isSuitable;
    }
    public void weather(){
        System.out.println(this.climate);
    }
}
