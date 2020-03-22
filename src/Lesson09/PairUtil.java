package Lesson09;

public final class PairUtil  {
    public static <K,V> Pair<V,K> swap(Pair <K, V> pair) {
        Pair <V, K> newPair = new Pair<>(pair.getItem2(), pair.getItem1());
        return newPair;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(23, "Hello!");
        System.out.println(pair.getItem1() + " " + pair.getItem2());
        System.out.println(PairUtil.swap(pair).getItem1() + " " + PairUtil.swap(pair).getItem2());
    }
}
