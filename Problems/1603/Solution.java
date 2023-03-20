class ParkingSystem {
    int[] space;

    public ParkingSystem(int big, int medium, int small) {
        space = new int[3];
        space[0] = big;
        space[1] = medium;
        space[2] = small;
    }

    public boolean addCar(int carType) {
        if (space[carType - 1] > 0) {
            space[carType - 1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */