public class Bank {
    private String userName;
    private int password;
    private int totalMoney;

    public Bank(String userName, int password, int totalMoney) {
        this.userName = userName;
        this.password = password;
        this.totalMoney = totalMoney;
    }




    @Override
    public String toString() {
        return "Bank{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
