-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 31 oct. 2019 à 15:37
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `leboncoin`
--
CREATE DATABASE IF NOT EXISTS `leboncoin` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `leboncoin`;

-- --------------------------------------------------------

--
-- Structure de la table `annonce`
--

DROP TABLE IF EXISTS `annonce`;
CREATE TABLE IF NOT EXISTS `annonce` (
  `dAnnonce` int(11) NOT NULL,
  `intitule` varchar(255) NOT NULL,
  `detail` varchar(255) NOT NULL,
  `prix` double NOT NULL,
  `idPersonne` int(11) NOT NULL,
  PRIMARY KEY (`dAnnonce`),
  KEY `fk_personne` (`idPersonne`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `annonce`
--

INSERT INTO `annonce` (`dAnnonce`, `intitule`, `detail`, `prix`, `idPersonne`) VALUES
(1, 'Velos Store', 'Vente ou Location de velos', 150, 1),
(2, 'PAP Appartements', 'Appartements à louer en IDF', 600, 2);

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `personneId` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `login` varchar(25) NOT NULL,
  `motDePasse` varchar(20) NOT NULL,
  `dateNaissance` varchar(20) NOT NULL,
  PRIMARY KEY (`personneId`),
  UNIQUE KEY `login` (`login`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`personneId`, `nom`, `prenom`, `login`, `motDePasse`, `dateNaissance`) VALUES
(1, 'ndiaye', 'khady', 'khady.ndiaye', 'khadygtm', '15-09-2014'),
(2, 'ba', 'boubacar', 'boubacar.ba', 'evamame', '15-09-2019');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
