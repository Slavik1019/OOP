package StudentDomen;

import java.util.List;

import StudentDomen.User;

public class AverageAge<T extends User> {
    private List<T> userList;
    private String userType;

    public AverageAge(List<T> userList, String userType) {
        this.userList = userList;
        this.userType = userType;
    }

    public int calculateAverageAge() {
        int sumAge = 0;
        for (T user : userList) {
            sumAge += user.getAge();
        }
        return userList.isEmpty() ? 0 : Math.round((float) sumAge / userList.size());
    }

    public void printAverageAge() {
        System.out.println("Средний возраст " + userType + ": " + calculateAverageAge());
    }
}