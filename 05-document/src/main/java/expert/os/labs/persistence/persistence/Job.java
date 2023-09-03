/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package expert.os.labs.persistence.persistence;

import jakarta.nosql.Column;
import org.eclipse.jnosql.mapping.Embeddable;

import java.util.Objects;

@Embeddable
public class Job {

    @Column
    private double salary;
    @Column
    private String occupation;

    Job(double salary, String occupation) {
        this.salary = salary;
        this.occupation = occupation;
    }

    public Job() {
    }

    public double getSalary() {
        return salary;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Job)) {
            return false;
        }
        Job job = (Job) o;
        return Double.compare(job.salary, salary) == 0 &&
                Objects.equals(occupation, job.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, occupation);
    }

    @Override
    public String toString() {
        return "Job{" +
                "salary=" + salary +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
