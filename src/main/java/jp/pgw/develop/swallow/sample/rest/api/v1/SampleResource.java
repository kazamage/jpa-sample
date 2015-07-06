package jp.pgw.develop.swallow.sample.rest.api.v1;

import jp.pgw.develop.swallow.sample.model.Child;
import jp.pgw.develop.swallow.sample.model.MoonChild;
import jp.pgw.develop.swallow.sample.model.Parent;
import jp.pgw.develop.swallow.sample.model.SuperParent;
import jp.pgw.develop.swallow.sample.persistence.repository.ChildRepository;
import jp.pgw.develop.swallow.sample.persistence.repository.MoonChildRepository;
import jp.pgw.develop.swallow.sample.persistence.repository.ParentRepository;
import jp.pgw.develop.swallow.sample.persistence.repository.SuperParentRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/samples")
@Transactional
public class SampleResource {

    @Inject
    private ChildRepository childRepository;

    @Inject
    private MoonChildRepository moonChildRepository;

    @Inject
    private ParentRepository parentRepository;

    @Inject
    private SuperParentRepository superParentRepository;

    @RequestMapping(value = "/normal", method = RequestMethod.GET)
    public long normal() {
        Parent parent = new Parent();
        parent.setName("normal parent");
        for (int i = 0; i < 5; i++) {
            Child child = new Child();
            child.setName("normal child" + i);
            child.setParent(parent);
            parent.getChildren().add(child);
        }
        parentRepository.save(parent);
        return 5;
    }

    @RequestMapping(value = "/groovy", method = RequestMethod.GET)
    public long groovy() {
        SuperParent parent = new SuperParent();
        parent.setName("super parent");
        for (int i = 0; i < 3; i++) {
            MoonChild child = new MoonChild();
            child.setName("moon child" + i);
            child.setParent(parent);
            parent.getChildren().add(child);
        }
        superParentRepository.save(parent);
        return 3;
    }

    @RequestMapping(value = "/normal/get", method = RequestMethod.GET)
    public List<Parent> getNormal() {
        List<Parent> list = parentRepository.findAll();
        for (Parent parent : list) {
            List<? extends Child> children = parent.getChildren();
            for (Child child : children) {
                child.getId();
            }
        }
        return list;
    }

    @RequestMapping(value = "/groovy/get", method = RequestMethod.GET)
    public List<SuperParent> getGroovy() {
        List<SuperParent> list = superParentRepository.findAll();
        for (SuperParent parent : list) {
            for (MoonChild child : parent.getChildren()) {
                child.getId();
            }
        }
        return list;
    }

}
