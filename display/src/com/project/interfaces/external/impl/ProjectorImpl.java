package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.Projector;
import com.project.interfaces.internal.rule.Toaster;

public class ProjectorImpl implements Projector {
    @Override
    public void powerOn() {
        System.out.println("Running powerOn in ProjectorImpl");
    }

    @Override
    public void selectSource() {
        System.out.println("Running selectSource in ProjectorImpl");
    }

    @Override
    public void adjustFocus() {
        System.out.println("Running adjustFocus in ProjectorImpl");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Running adjustBrightness in ProjectorImpl");
    }

    @Override
    public void projectImage() {
        System.out.println("Running projectImage in ProjectorImpl");
    }

    @Override
    public void freezeFrame() {
        System.out.println("Running freezeFrame in ProjectorImpl");
    }

    @Override
    public void powerOff() {
        System.out.println("Running powerOff in ProjectorImpl");
    }

    public static class ToasterImpl implements Toaster {
        @Override
        public void insertBread() {
            System.out.println("Running insertBread in ToasterImpl");
        }

        @Override
        public void setTimer() {
            System.out.println("Running setTimer in ToasterImpl");
        }

        @Override
        public void toast() {
            System.out.println("Running toast in ToasterImpl");
        }

        @Override
        public void popUp() {
            System.out.println("Running popUp in ToasterImpl");
        }

        @Override
        public void cleanTray() {
            System.out.println("Running cleanTray in ToasterImpl");
        }
    }
}
