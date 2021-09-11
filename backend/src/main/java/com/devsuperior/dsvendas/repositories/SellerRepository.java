package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}//-Um objeto SellerRepository responsável por acessar os dados de um Seller, vou ter aqui prontinho operações de inserir, buscar, atualizar,
//-ja vem implementado pelo framework
