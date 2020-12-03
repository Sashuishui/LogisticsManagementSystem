package com.Wuye.welcome;

import com.Wuye.tools.GUITools;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame {
    public Welcome() {

        // 欢迎图片与标题图标未实现
        this.setTitle("汤臣一品物业管理系统");
        this.setSize(500, 400);
        GUITools.center(this);
        addMenu();
    }

    public void addMenu() {
        JMenuBar jMenuBar = new JMenuBar();  // 菜单栏对象
        this.setJMenuBar(jMenuBar);  // 将菜单栏放入窗口中
        JMenu mainPage = new JMenu("主页");  // 定义菜单栏一级菜单文字
        JMenu systemMenu = new JMenu("系统管理");  // 定义菜单栏一级菜单文字
        JMenu wuyeInfo = new JMenu("物业信息");  // 定义菜单栏一级菜单文字
        JMenu Xiaofei = new JMenu("消费指数");  // 定义菜单栏一级菜单文字
        JMenu Baobiao = new JMenu("消费报表");  // 定义菜单栏一级菜单文字
        jMenuBar.add(mainPage);  // 将一级菜单主页放入菜单栏中
        jMenuBar.add(systemMenu);  // 将一级菜单系统管理放入菜单栏中
        jMenuBar.add(wuyeInfo);  // 将一级菜单物业信息放入菜单栏中
        jMenuBar.add(Xiaofei);  // 将一级菜单消费指数放入菜单栏中
        jMenuBar.add(Baobiao);  // 将一级菜单消费报表放入菜单栏中

        JMenuItem exit = new JMenuItem("退出");  // 定义二级菜单退出
        // 给退出添加监听
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        systemMenu.add(exit); // 将二级菜单退出添加到一级菜单系统管理中

        // 定义其他二级窗口
        JMenuItem placeItem = new JMenuItem("小区信息维护");
        JMenuItem water = new JMenuItem("水费");
        JMenuItem ranqi = new JMenuItem("气费");
        JMenuItem dian = new JMenuItem("电费");
        JMenuItem watertable = new JMenuItem("水费报表");
        JMenuItem ranqitable = new JMenuItem("气费报表");
        JMenuItem diantable = new JMenuItem("电费报表");
        placeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 跳转到小区信息维护窗口
            }
        });
        water.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 水费窗口
            }
        });
        ranqi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 燃气窗口
            }
        });
        dian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 电费窗口
            }
        });
        watertable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 水费窗口
            }
        });
        ranqitable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 燃气窗口
            }
        });
        diantable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 电费窗口
            }
        });
        wuyeInfo.add(placeItem);
        Xiaofei.add(water);
        Xiaofei.add(dian);
        Xiaofei.add(ranqi);
        Baobiao.add(watertable);
        Baobiao.add(diantable);
        Baobiao.add(ranqitable);
    }
}
