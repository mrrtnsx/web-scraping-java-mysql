package com.meuprojeto;

import com.meuprojeto.dao.ProdutoDAO;
import entities.Produto;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args){

        try {
            Document doc = Jsoup.connect("https://books.toscrape.com/").get();

            Elements produtos = doc.select("article.product_pod");

            ProdutoDAO dao = new ProdutoDAO();

            for (Element produto: produtos){
                String nome = produto.select("h3 a").attr("title");
                String preco = produto.select(".price_color").text();

                Produto objProduto = new Produto(nome, preco);
                System.out.println(objProduto);
                dao.salvar(objProduto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
