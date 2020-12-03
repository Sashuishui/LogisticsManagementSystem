package com.Wuye.welcome;

import com.Wuye.tools.GUITools;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame {
    public Welcome() {

        // ��ӭͼƬ�����ͼ��δʵ��
        this.setTitle("����һƷ��ҵ����ϵͳ");
        this.setSize(500, 400);
        GUITools.center(this);
        addMenu();
    }

    public void addMenu() {
        JMenuBar jMenuBar = new JMenuBar();  // �˵�������
        this.setJMenuBar(jMenuBar);  // ���˵������봰����
        JMenu mainPage = new JMenu("��ҳ");  // ����˵���һ���˵�����
        JMenu systemMenu = new JMenu("ϵͳ����");  // ����˵���һ���˵�����
        JMenu wuyeInfo = new JMenu("��ҵ��Ϣ");  // ����˵���һ���˵�����
        JMenu Xiaofei = new JMenu("����ָ��");  // ����˵���һ���˵�����
        JMenu Baobiao = new JMenu("���ѱ���");  // ����˵���һ���˵�����
        jMenuBar.add(mainPage);  // ��һ���˵���ҳ����˵�����
        jMenuBar.add(systemMenu);  // ��һ���˵�ϵͳ�������˵�����
        jMenuBar.add(wuyeInfo);  // ��һ���˵���ҵ��Ϣ����˵�����
        jMenuBar.add(Xiaofei);  // ��һ���˵�����ָ������˵�����
        jMenuBar.add(Baobiao);  // ��һ���˵����ѱ������˵�����

        JMenuItem exit = new JMenuItem("�˳�");  // ��������˵��˳�
        // ���˳���Ӽ���
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        systemMenu.add(exit); // �������˵��˳���ӵ�һ���˵�ϵͳ������

        // ����������������
        JMenuItem placeItem = new JMenuItem("С����Ϣά��");
        JMenuItem water = new JMenuItem("ˮ��");
        JMenuItem ranqi = new JMenuItem("����");
        JMenuItem dian = new JMenuItem("���");
        JMenuItem watertable = new JMenuItem("ˮ�ѱ���");
        JMenuItem ranqitable = new JMenuItem("���ѱ���");
        JMenuItem diantable = new JMenuItem("��ѱ���");
        placeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ��ת��С����Ϣά������
            }
        });
        water.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ˮ�Ѵ���
            }
        });
        ranqi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ȼ������
            }
        });
        dian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ��Ѵ���
            }
        });
        watertable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ˮ�Ѵ���
            }
        });
        ranqitable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ȼ������
            }
        });
        diantable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ��Ѵ���
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
