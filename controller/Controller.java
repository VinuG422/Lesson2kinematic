package controller;

import model.CalculationException;
import model.Model;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String viStr = view.getInitialVelocity();
        String aStr = view.getAcceleration();
        String tStr = view.getTime();
        try {
            double result = model.calculateVf(viStr, aStr, tStr);
            view.setResult(result);
        }
        catch (CalculationException ex) {
            view.setError(ex.getMessage());
        }
    }
}
