package question3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * The test class AuditeurCNAMTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AuditeurCNAMTest
{
     public static void main(String[] args) {
    
        AuditeurCNAM auditeur1 = new AuditeurCNAM("Ma?riane", "Dagher", "12345");

        System.out.println("Auditeur Information:");
        System.out.println(auditeur1);

        System.out.println("Login: " + auditeur1.login());
    }
}

