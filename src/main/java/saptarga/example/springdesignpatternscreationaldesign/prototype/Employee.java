package saptarga.example.springdesignpatternscreationaldesign.prototype;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String id;
    private String name;
    private Position position;
    private Long salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
