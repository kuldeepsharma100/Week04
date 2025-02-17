package annotations.customannotations.advancelevel.roleallowed;

import java.lang.reflect.Method;

public class AccessControl {

    public static void checkAccess(User user, Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

                if (!user.getRole().equals(roleAllowed.value())) {
                    System.out.println("Access Denied! " + user.getUsername() + " does not have permission to access " + methodName);
                    return;
                }
            }

            // Invoke the method if access is granted
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
