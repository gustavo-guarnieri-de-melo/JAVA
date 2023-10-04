-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.6.8-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para benezinho-petshop
CREATE DATABASE IF NOT EXISTS `benezinho-petshop` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `benezinho-petshop`;

-- Copiando estrutura para tabela benezinho-petshop.sq_authority
CREATE TABLE IF NOT EXISTS `sq_authority` (
  `next_not_cached_value` bigint(21) NOT NULL,
  `minimum_value` bigint(21) NOT NULL,
  `maximum_value` bigint(21) NOT NULL,
  `start_value` bigint(21) NOT NULL COMMENT 'start value when sequences is created or value if RESTART is used',
  `increment` bigint(21) NOT NULL COMMENT 'increment value',
  `cache_size` bigint(21) unsigned NOT NULL,
  `cycle_option` tinyint(1) unsigned NOT NULL COMMENT '0 if no cycles are allowed, 1 if the sequence should begin a new cycle when maximum_value is passed',
  `cycle_count` bigint(21) NOT NULL COMMENT 'How many cycles have been done'
) ENGINE=InnoDB SEQUENCE=1;

-- Copiando dados para a tabela benezinho-petshop.sq_authority: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `sq_authority` DISABLE KEYS */;
INSERT IGNORE INTO `sq_authority` (`next_not_cached_value`, `minimum_value`, `maximum_value`, `start_value`, `increment`, `cache_size`, `cycle_option`, `cycle_count`) VALUES
	(1, 1, 9223372036854775806, 1, 50, 1000, 0, 0);
/*!40000 ALTER TABLE `sq_authority` ENABLE KEYS */;

-- Copiando estrutura para tabela benezinho-petshop.sq_pessoa
CREATE TABLE IF NOT EXISTS `sq_pessoa` (
  `next_not_cached_value` bigint(21) NOT NULL,
  `minimum_value` bigint(21) NOT NULL,
  `maximum_value` bigint(21) NOT NULL,
  `start_value` bigint(21) NOT NULL COMMENT 'start value when sequences is created or value if RESTART is used',
  `increment` bigint(21) NOT NULL COMMENT 'increment value',
  `cache_size` bigint(21) unsigned NOT NULL,
  `cycle_option` tinyint(1) unsigned NOT NULL COMMENT '0 if no cycles are allowed, 1 if the sequence should begin a new cycle when maximum_value is passed',
  `cycle_count` bigint(21) NOT NULL COMMENT 'How many cycles have been done'
) ENGINE=InnoDB SEQUENCE=1;

-- Copiando dados para a tabela benezinho-petshop.sq_pessoa: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `sq_pessoa` DISABLE KEYS */;
INSERT IGNORE INTO `sq_pessoa` (`next_not_cached_value`, `minimum_value`, `maximum_value`, `start_value`, `increment`, `cache_size`, `cycle_option`, `cycle_count`) VALUES
	(50001, 1, 9223372036854775806, 1, 50, 1000, 0, 0);
/*!40000 ALTER TABLE `sq_pessoa` ENABLE KEYS */;

-- Copiando estrutura para tabela benezinho-petshop.sq_user
CREATE TABLE IF NOT EXISTS `sq_user` (
  `next_not_cached_value` bigint(21) NOT NULL,
  `minimum_value` bigint(21) NOT NULL,
  `maximum_value` bigint(21) NOT NULL,
  `start_value` bigint(21) NOT NULL COMMENT 'start value when sequences is created or value if RESTART is used',
  `increment` bigint(21) NOT NULL COMMENT 'increment value',
  `cache_size` bigint(21) unsigned NOT NULL,
  `cycle_option` tinyint(1) unsigned NOT NULL COMMENT '0 if no cycles are allowed, 1 if the sequence should begin a new cycle when maximum_value is passed',
  `cycle_count` bigint(21) NOT NULL COMMENT 'How many cycles have been done'
) ENGINE=InnoDB SEQUENCE=1;

-- Copiando dados para a tabela benezinho-petshop.sq_user: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `sq_user` DISABLE KEYS */;
INSERT IGNORE INTO `sq_user` (`next_not_cached_value`, `minimum_value`, `maximum_value`, `start_value`, `increment`, `cache_size`, `cycle_option`, `cycle_count`) VALUES
	(50001, 1, 9223372036854775806, 1, 50, 1000, 0, 0);
/*!40000 ALTER TABLE `sq_user` ENABLE KEYS */;

-- Copiando estrutura para tabela benezinho-petshop.tb_authority
CREATE TABLE IF NOT EXISTS `tb_authority` (
  `ID_AUTHORITY` bigint(20) NOT NULL,
  `NM_AUTHORITY` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_AUTHORITY`),
  UNIQUE KEY `UK_NM_AUTHORITY` (`NM_AUTHORITY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela benezinho-petshop.tb_authority: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_authority` DISABLE KEYS */;
INSERT IGNORE INTO `tb_authority` (`ID_AUTHORITY`, `NM_AUTHORITY`) VALUES
	(1, 'CLIENTE');
/*!40000 ALTER TABLE `tb_authority` ENABLE KEYS */;

-- Copiando estrutura para tabela benezinho-petshop.tb_authority_usuario
CREATE TABLE IF NOT EXISTS `tb_authority_usuario` (
  `USUARIO` bigint(20) NOT NULL,
  `AUTHORITY` bigint(20) NOT NULL,
  PRIMARY KEY (`USUARIO`,`AUTHORITY`),
  KEY `FK_USER_AUTHORITY` (`AUTHORITY`),
  CONSTRAINT `FK_AUTHORIRY_USER` FOREIGN KEY (`USUARIO`) REFERENCES `tb_user` (`ID_USUARIO`),
  CONSTRAINT `FK_USER_AUTHORITY` FOREIGN KEY (`AUTHORITY`) REFERENCES `tb_authority` (`ID_AUTHORITY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela benezinho-petshop.tb_authority_usuario: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_authority_usuario` DISABLE KEYS */;
INSERT IGNORE INTO `tb_authority_usuario` (`USUARIO`, `AUTHORITY`) VALUES
	(1, 1);
/*!40000 ALTER TABLE `tb_authority_usuario` ENABLE KEYS */;

-- Copiando estrutura para tabela benezinho-petshop.tb_pessoa
CREATE TABLE IF NOT EXISTS `tb_pessoa` (
  `TP_PESSOA` varchar(31) NOT NULL,
  `ID_PESSOA` bigint(20) NOT NULL,
  `DT_NASCIMENTO` date DEFAULT NULL,
  `NM_PESSOA` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela benezinho-petshop.tb_pessoa: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_pessoa` DISABLE KEYS */;
INSERT IGNORE INTO `tb_pessoa` (`TP_PESSOA`, `ID_PESSOA`, `DT_NASCIMENTO`, `NM_PESSOA`) VALUES
	('PF', 1, '1977-03-08', 'Benefrancis do Nascimento'),
	('PJ', 2, '2022-03-08', 'Benezinho Holding');
/*!40000 ALTER TABLE `tb_pessoa` ENABLE KEYS */;

-- Copiando estrutura para tabela benezinho-petshop.tb_pf
CREATE TABLE IF NOT EXISTS `tb_pf` (
  `NR_CPF` varchar(255) NOT NULL,
  `ID_PESSOA` bigint(20) NOT NULL,
  PRIMARY KEY (`ID_PESSOA`),
  UNIQUE KEY `UK_PF_CPF` (`NR_CPF`),
  CONSTRAINT `FKo14w6uw4ru9105ls0g72jayei` FOREIGN KEY (`ID_PESSOA`) REFERENCES `tb_pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela benezinho-petshop.tb_pf: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_pf` DISABLE KEYS */;
INSERT IGNORE INTO `tb_pf` (`NR_CPF`, `ID_PESSOA`) VALUES
	('123456789', 1);
/*!40000 ALTER TABLE `tb_pf` ENABLE KEYS */;

-- Copiando estrutura para tabela benezinho-petshop.tb_pj
CREATE TABLE IF NOT EXISTS `tb_pj` (
  `NR_CNPJ` varchar(255) DEFAULT NULL,
  `ID_PESSOA` bigint(20) NOT NULL,
  PRIMARY KEY (`ID_PESSOA`),
  UNIQUE KEY `UK_PJ_CNPJ` (`NR_CNPJ`),
  CONSTRAINT `FK2f1f5uwwiv1xqrn1dxg9r5mqm` FOREIGN KEY (`ID_PESSOA`) REFERENCES `tb_pessoa` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela benezinho-petshop.tb_pj: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_pj` DISABLE KEYS */;
INSERT IGNORE INTO `tb_pj` (`NR_CNPJ`, `ID_PESSOA`) VALUES
	('123456789', 2);
/*!40000 ALTER TABLE `tb_pj` ENABLE KEYS */;

-- Copiando estrutura para tabela benezinho-petshop.tb_user
CREATE TABLE IF NOT EXISTS `tb_user` (
  `ID_USUARIO` bigint(20) NOT NULL,
  `USER_PASSWORD` varchar(255) NOT NULL,
  `USER_EMAIL` varchar(255) NOT NULL,
  `PESSOA` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID_USUARIO`),
  UNIQUE KEY `UK_USER_EMAIL` (`USER_EMAIL`),
  KEY `FK_USER_PESSOA` (`PESSOA`),
  CONSTRAINT `FK_USER_PESSOA` FOREIGN KEY (`PESSOA`) REFERENCES `tb_pf` (`ID_PESSOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Copiando dados para a tabela benezinho-petshop.tb_user: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
INSERT IGNORE INTO `tb_user` (`ID_USUARIO`, `USER_PASSWORD`, `USER_EMAIL`, `PESSOA`) VALUES
	(1, '4813494D137E1631BBA301D5ACAB6E7BB7AA74CE1185D456565EF51D737677B2', 'benefrancis@gmail.com', 1);
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
