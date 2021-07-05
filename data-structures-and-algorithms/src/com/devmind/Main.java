import com.core.AccessModifiers;
 
public class Main {
  public static void main(String[] args) {
    AccessModifiers am = new AccessModifiers();
    am.token = "pr!v@T3T0k3N"; // (1)
    am.removeToken(); // (2)
    am.invalidateToken(); // (3)
    am.setToken ("N3W_T0K3n!."); // (4)
    am.getToken(); // (5)
  }
}