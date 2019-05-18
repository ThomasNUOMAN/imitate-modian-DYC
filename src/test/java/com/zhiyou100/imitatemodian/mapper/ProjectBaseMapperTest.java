package com.zhiyou100.imitatemodian.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhiyou100.imitatemodian.entity.ProjectBase;
import com.zhiyou100.imitatemodian.entity.ProjectUpdate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectBaseMapperTest {

    @Autowired
    private UserProjectBaseDTOMapper userProjectBaseDTOMapper;

    @Autowired
    private ProjectBaseMapper projectBaseMapper;

    @Autowired
    private ProjectDetailMapper projectDetailMapper;

    @Autowired
    private ProjectUpdateMapper projectUpdateMapper;


    @Test
    public void testPage() {

//        Page page = new Page(1,3);
//        IPage iPage = projectBaseMapper.projectBases(page);
//
//        // 结果是 3 就对了
//        System.out.println("页数:  " + iPage.getPages());
//
//        IPage iPageById = projectBaseMapper.projectBasesById(page, 1);
//
//        // 结果是 2 就对了
//        System.out.println("页数:  " + iPageById.getPages());
          // 查询
//        List<ProjectBase> projectBaseById = projectBaseMapper.selectList(new QueryWrapper<ProjectBase>().eq(true,"user_id",1));
//
//        ProjectBase projectBase = new ProjectBase();
//        projectBase.setUserId(2);
//        projectBase.setTitle("荒野大镖客");
//        projectBase.setSubtitle("双枪光头强");
//        projectBase.setProjectItdc("我双枪贼6");
//        projectBase.setStatus(2);
//        projectBase.setRaiseAmount(250);
//
//        for (int i = 0; i < 3; i++) {
            // 添加
//            projectBaseMapper.insert(projectBase);
//        }
//
        // 更新
//        projectBase.setSubtitle("雷云宙斯~!!!");
//        projectBaseMapper.update(projectBase,new QueryWrapper<ProjectBase>().eq(true,"project_base_id",2));
        // 删除
//        projectBaseMapper.deleteById(10);
        // 详情
//        System.out.println(projectDetailMapper.selectById(7));
        // 展示更新
//        projectUpdateMapper.selectById(2);
//        // 添加更新
//        ProjectUpdate projectUpdate = new ProjectUpdate();
//        projectUpdate.setUpdateTitle("红鲤鱼与绿鲤鱼与驴");
//        projectUpdate.setTime(new Date());
//        projectUpdate.setUpdateProjectBaseId(2);
//        projectUpdate.setUpdateUserId(1);
//        projectUpdate.setDetail("别把驴丢了~~~~~~~~!!");
//
//        for (int i = 0; i < 2; i++) {
//
//            projectUpdateMapper.insert(projectUpdate);
//        }

    }


}