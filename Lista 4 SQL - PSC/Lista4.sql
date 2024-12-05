SELECT 
    f.nome AS Fornecedor,
    SUM(p.preco) AS Soma_Preco
FROM 
    fornecedor f
JOIN 
    produto p 
ON 
    f.id = p.id_fornecedor
GROUP BY 
    f.nome
HAVING 
    SUM(p.preco) > 500;
