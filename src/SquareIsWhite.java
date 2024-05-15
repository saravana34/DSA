class SquareIsWhite {
    public boolean squareIsWhite(String coordinates) {
        char[] cor = coordinates.toCharArray();
        int a = cor[0];
        int b = cor[1];
        if(a % 2 == 1 && b % 2 == 1)
            return false;
        else if(a % 2 == 1 && b % 2 == 0)
            return true;
        else if(a % 2 == 0 && b % 2 == 1)
            return true;
        else if(a % 2 == 0 && b % 2 == 0)
            return false;
        return true;
    }
}
