class SphereVolume {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        double volume = (4.0/3.0) * 3.14 * Math.pow(r, 3);
        System.out.println("Volume Of Sphere is :" + volume);
    }
}
