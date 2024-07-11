package dataContainer;

@InheritedAnnotation(day = 2)
public class InheritedClass2 extends InheritedAnnotatedClass {


    @RepeatableAnnotation(hours = 12, prior = 2, details = "Prior2")
    public <T extends DataContainer> int method1(T data) {
        System.out.println("id: " + data.getId());
        return data.getId();
    }

    @RepeatableAnnotation(hours = 12, prior = 1, details = "Prior1")
    @RepeatableAnnotation(hours = 11, prior = 3, details = "Prior3")
    public <T extends DataContainer> String method2(T data) {
        System.out.println("name: " + data.getName());
        return data.getName();
    }

    @RepeatableAnnotation(hours = 12, prior = 2, details = "Prior2")
    @RepeatableAnnotation(hours = 13, prior = 2, details = "Prior2")
    @RepeatableAnnotation(hours = 12, prior = 3, details = "Prior3")
    public <T extends DataContainer> boolean method3(T data) {
        System.out.println("onDuty: " + data.isOnDuty());
        return data.isOnDuty();
    }
}
