package org.example;

import java.time.LocalDate;

public class JuiceCoctel extends Coctel{

    private LocalDate fechavencimiento;

    public JuiceCoctel() {
    }

    public JuiceCoctel(String nombre, Long precio, LocalDate fechavencimiento) {
        super(nombre, precio);
        this.fechavencimiento = fechavencimiento;
    }
}
