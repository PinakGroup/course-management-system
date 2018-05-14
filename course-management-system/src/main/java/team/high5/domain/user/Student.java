package team.high5.domain.user;

import team.high5.domain.entities.Enrolment;

import javax.persistence.*;
import java.util.List;

/**
 * @Author : Charles Ma
 * @Date : 2018/5/9 0009
 * @Time : 14:48
 * @Description : Student
 */
@Entity
@Table(name = "student")
public class Student extends User {

    @Column(name = "maxLoad")
    private int maxLoad = 1;
    @Column(name = "maxElectives")
    private int maxElectives = 1;
//    @OneToMany(mappedBy = "enrolId", cascade = CascadeType.ALL)
    @Transient
    private List<Enrolment> performance;

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getMaxElectives() {
        return maxElectives;
    }

    public void setMaxElectives(int maxElectives) {
        this.maxElectives = maxElectives;
    }

    public List<Enrolment> getPerformance() {
        return performance;
    }

    public void setPerformance(List<Enrolment> performance) {
        this.performance = performance;
    }
}
