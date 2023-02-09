package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplementPropiaDependencia implements ComponentPropiaDependencia{

    @Override
    public void aviso() {
        System.out.println("Este es aviso, un implement dentro del ComponentImplementPropiaDependencia");
    }
}
