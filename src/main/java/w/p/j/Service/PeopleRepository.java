/*
 * Copyright (c) 2015 - 11 - 26  11 : 13 :27
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package w.p.j.Service;

import org.springframework.data.mongodb.repository.MongoRepository;
import w.p.j.model.People;

import java.util.List;

/**
 * Name：PeopleRepository
 * Time：2015/11/26 23:13
 * author：WPJ587
 * description：业务
 **/

public interface PeopleRepository extends MongoRepository<People,String> {

    public People findByName(String name);

    public List<People> findByAge(int age);
}
