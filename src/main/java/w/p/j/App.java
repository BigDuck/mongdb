package w.p.j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import w.p.j.Service.PeopleRepository;
import w.p.j.model.People;

import java.util.List;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
    @Autowired
    PeopleRepository peopleRepository;
    public static void main( String[] args )
    {
        System.out.println( "---------------------------------!" );
        SpringApplication.run(App.class,args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("people："+peopleRepository);
        this.peopleRepository.deleteAll();

/**
 * 增加
// */
        for (int i = 0; i <10 ; i++) {
            this.peopleRepository.save(new People("zhangsan","福建",i+40));
        }
        List<People> peopleList= this.peopleRepository.findAll();
        System.out.println(peopleList.toString());
        System.out.println("总计条数；"+   this.peopleRepository.count());
    }
}
