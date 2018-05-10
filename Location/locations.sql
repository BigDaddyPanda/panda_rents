#
# TABLE STRUCTURE FOR: persons
#

DROP TABLE IF EXISTS `persons`;

CREATE TABLE `persons` (
  `id_person` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `birth` date NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `image` varchar(20) NOT NULL,
  `isAdmin` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_person`),
  UNIQUE KEY `username` (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`, `birth`, `username`, `password`, `image`, `isAdmin`) VALUES ('85827912', 'Trey', 'Quitzon', '588-062-9374', '1971-02-04', 'boyer.wade@hotmail.c', '', '', 1);
INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`, `birth`, `username`, `password`, `image`, `isAdmin`) VALUES ('63089653', 'Josianne', 'Tremblay', '02998172828', '1999-12-06', 'uhermiston@gmail.com', '', '', 0);
INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`, `birth`, `username`, `password`, `image`, `isAdmin`) VALUES ('18191424', 'Clotilde', 'Stoltenberg', '+14(2)1971909448', '1999-10-29', 'rkuhn@hotmail.com', '', '', 0);
INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`, `birth`, `username`, `password`, `image`, `isAdmin`) VALUES ('19227375', 'Lilian', 'Fisher', '705-653-3857', '1995-05-28', 'matilde82@metz.com', '', '', 1);
INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`, `birth`, `username`, `password`, `image`, `isAdmin`) VALUES ('20445133', 'Charlie', 'Borer', '1-228-074-8729', '1984-01-11', 'clifton.luettgen@hot', '', '', 0);
INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`, `birth`, `username`, `password`, `image`, `isAdmin`) VALUES ('14368103', 'Jamil', 'Cummerata', '1-436-700-1595x7249', '1998-05-16', 'ryan.henry@mertz.com', '', '', 0);
INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`, `birth`, `username`, `password`, `image`, `isAdmin`) VALUES ('45177392', 'Louisa', 'Steuber', '967.530.2685', '1985-12-02', 'winston37@jakubowski', '', '', 0);
INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`, `birth`, `username`, `password`, `image`, `isAdmin`) VALUES ('78843776', 'Alexa', 'Mills', '844.347.3789x96159', '1977-04-19', 'nkulas@gmail.com', '', '', 1);
INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`, `birth`, `username`, `password`, `image`, `isAdmin`) VALUES ('32765373', 'Cleve', 'Hoeger', '1-935-684-5726x81257', '1993-10-21', 'magdalen.hahn@becker', '', '', 0);
INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`, `birth`, `username`, `password`, `image`, `isAdmin`) VALUES ('35240228', 'Verner', 'Windler', '(175)575-3505x489', '2014-06-15', 'smraz@botsford.info', '', '', 0);


#
# TABLE STRUCTURE FOR: rent
#

DROP TABLE IF EXISTS `rent`;

CREATE TABLE `rent` (
  `id_person` varchar(20) NOT NULL,
  `id_vehicle` varchar(20) NOT NULL,
  `start` date NOT NULL,
  `end` date NOT NULL,
  `price` float NOT NULL,
  `fees` float NOT NULL,
  PRIMARY KEY (`id_person`,`id_vehicle`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('45177392', '853TN7226', '2018-03-23', '2019-02-23', '391.77', '120.43');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('78843776', '270TN7537', '2017-07-02', '2018-10-19', '734.59', '192.1');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('14368103', '252TN6621', '2018-02-08', '2018-08-20', '781.42', '153.17');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('32765373', '278TN3059', '2018-04-20', '2018-05-29', '485.1', '184.48');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('32765373', '105TN6665', '2017-09-29', '2019-05-03', '445.14', '110.98');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('63089653', '502TN6800', '2017-07-04', '2019-01-28', '836.31', '91.71');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('78843776', '467TN0462', '2018-01-10', '2018-07-03', '499.18', '136.01');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('32765373', '564TN4814', '2017-06-22', '2018-06-18', '923.46', '158.86');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('63089653', '036TN9327', '2018-04-17', '2019-02-20', '995.33', '164.78');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('45177392', '564TN4814', '2017-12-27', '2018-10-23', '887.41', '118.98');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('14368103', '337TN5663', '2018-01-13', '2018-10-21', '829.3', '170.19');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('19227375', '079TN4511', '2017-06-25', '2019-05-02', '114.99', '54.16');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('32765373', '534TN7301', '2017-07-28', '2018-05-12', '711.37', '70.96');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('85827912', '667TN8145', '2018-03-31', '2019-01-03', '800.47', '96.68');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('63089653', '620TN8078', '2018-04-25', '2018-12-01', '348.64', '86.98');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('45177392', '568TN7400', '2018-03-03', '2019-01-21', '933.13', '44.7');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('85827912', '568TN7400', '2017-07-14', '2018-07-23', '943', '83.82');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('78843776', '358TN1938', '2018-05-07', '2019-04-04', '270.04', '104.09');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('78843776', '278TN3059', '2018-04-17', '2019-02-15', '668.85', '29.75');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('32765373', '620TN8078', '2018-01-28', '2018-11-08', '807.44', '197.69');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('63089653', '337TN5663', '2018-04-28', '2018-08-18', '491.59', '82.98');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('14368103', '236TN5314', '2017-09-04', '2018-11-12', '109.24', '18.7');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('85827912', '823TN5033', '2017-10-07', '2019-01-01', '225.68', '189.2');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('19227375', '829TN6436', '2018-03-27', '2019-04-20', '381.01', '88.05');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('18191424', '813TN5487', '2017-09-07', '2018-10-29', '437.04', '103.54');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('32765373', '236TN5314', '2018-02-09', '2018-06-30', '319.64', '84.55');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('18191424', '723TN1631', '2017-12-28', '2019-02-25', '511.54', '161.68');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('19227375', '564TN4814', '2017-07-18', '2018-06-28', '107.86', '153.56');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('19227375', '269TN6233', '2018-04-11', '2018-07-30', '649.23', '199.84');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('19227375', '022TN6130', '2017-11-07', '2019-02-27', '531.97', '137.4');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('78843776', '813TN5487', '2017-05-25', '2018-09-19', '958.16', '190.2');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('45177392', '762TN2039', '2018-04-07', '2019-03-19', '883.9', '47.07');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('32765373', '462TN0271', '2017-11-04', '2018-06-13', '272.65', '155.72');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('18191424', '432TN0008', '2017-07-20', '2019-05-01', '335.11', '18.17');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('63089653', '554TN9635', '2017-06-10', '2018-07-26', '597.9', '55.35');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('14368103', '511TN1766', '2017-05-29', '2019-01-12', '899.89', '32.17');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('78843776', '156TN0964', '2017-12-07', '2019-03-17', '698.69', '157.32');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('45177392', '735TN4069', '2017-12-21', '2018-10-01', '480.32', '40.58');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('14368103', '823TN5033', '2017-10-11', '2018-11-10', '947.72', '162.13');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('45177392', '105TN6665', '2017-11-06', '2018-12-19', '836.79', '178.93');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('63089653', '236TN5314', '2018-04-16', '2019-02-23', '762.92', '99.93');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('20445133', '961TN0718', '2018-01-11', '2018-12-07', '293.13', '60.06');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('85827912', '559TN0377', '2018-03-24', '2018-12-13', '449.69', '58.67');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('35240228', '262TN3569', '2017-11-01', '2018-11-14', '895.41', '62.55');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('78843776', '762TN2039', '2018-01-22', '2018-09-26', '130.97', '70.57');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('19227375', '689TN8086', '2017-06-07', '2018-11-02', '539.34', '48.95');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('45177392', '768TN3642', '2017-05-22', '2018-05-21', '811.16', '189.31');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('35240228', '227TN9647', '2017-06-05', '2018-05-13', '118.3', '109.29');
INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`) VALUES ('19227375', '571TN4694', '2017-11-23', '2019-04-11', '312.19', '44.13');


#
# TABLE STRUCTURE FOR: vehicles
#

DROP TABLE IF EXISTS `vehicles`;

CREATE TABLE `vehicles` (
  `id_vehicle` varchar(20) NOT NULL,
  `constructeur` varchar(20) NOT NULL,
  `modele` varchar(20) NOT NULL,
  `vitesse` int(3) NOT NULL,
  `color` varchar(20) NOT NULL,
  `seats` tinyint(4) NOT NULL,
  `energy` varchar(20) NOT NULL,
  `image` varchar(20) NOT NULL,
  PRIMARY KEY (`id_vehicle`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('534TN7301', 'Aqua', 'vkz-77', 280, 'Black', 6, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('421TN7003', 'Tan', 'xtr-99', 300, 'Lavender', 4, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('735TN4069', 'MistyRose', 'phi-32', 210, 'AntiqueWhite', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('252TN6621', 'Wheat', 'jye-24', 210, 'GoldenRod', 6, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('937TN7354', 'Blue', 'lpr-26', 180, 'FloralWhite', 6, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('101TN8229', 'HoneyDew', 'vdz-10', 250, 'Aqua', 4, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('784TN1899', 'Gainsboro', 'fdw-52', 300, 'SteelBlue', 4, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('689TN8086', 'GhostWhite', 'uco-43', 250, 'Green', 4, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('762TN2039', 'Aqua', 'xcc-43', 210, 'DeepSkyBlue', 6, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('661TN3892', 'Gainsboro', 'sjn-03', 280, 'FloralWhite', 6, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('156TN0964', 'SpringGreen', 'qwp-27', 300, 'Wheat', 6, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('554TN9635', 'DarkSalmon', 'ggj-31', 180, 'LightYellow', 6, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('511TN1766', 'Tan', 'cwj-46', 280, 'Tan', 4, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('022TN6130', 'Linen', 'kxf-38', 210, 'Fuchsia', 6, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('564TN4814', 'Moccasin', 'lnl-53', 210, 'Yellow', 4, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('502TN6800', 'White', 'xkx-80', 280, 'LightYellow', 4, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('236TN5314', 'Aqua', 'kfd-70', 280, 'Fuchsia', 4, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('829TN6436', 'FireBrick', 'ctr-36', 250, 'Moccasin', 6, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('462TN0271', 'Yellow', 'ktb-57', 300, 'LightYellow', 4, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('853TN7226', 'GoldenRod', 'zox-70', 300, 'FireBrick', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('768TN3642', 'Moccasin', 'pfq-00', 180, 'GhostWhite', 4, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('079TN4511', 'OldLace', 'zhi-54', 250, 'Moccasin', 6, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('467TN0462', 'Teal', 'kjg-85', 180, 'Magenta', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('434TN9835', 'MediumAquaMarine', 'gpc-58', 250, 'Tan', 6, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('961TN0718', 'Lime', 'tvq-96', 180, 'Brown', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('432TN0008', 'MediumAquaMarine', 'mbv-28', 300, 'Olive', 6, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('042TN5493', 'Fuchsia', 'dsb-01', 250, 'OldLace', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('174TN2099', 'White', 'ald-32', 300, 'GoldenRod', 4, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('105TN6665', 'FloralWhite', 'mlc-70', 180, 'Teal', 6, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('454TN5844', 'DodgerBlue', 'qsi-44', 250, 'MediumAquaMarine', 4, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('269TN6233', 'DeepSkyBlue', 'htd-80', 280, 'MediumBlue', 4, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('270TN7537', 'Brown', 'yii-49', 180, 'BlueViolet', 6, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('568TN7400', 'Navy', 'eaa-69', 210, 'LightBlue', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('823TN5033', 'White', 'zlg-89', 210, 'DarkSalmon', 6, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('571TN4694', 'DodgerBlue', 'dan-48', 180, 'Lavender', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('337TN5663', 'DarkSalmon', 'tci-25', 210, 'AntiqueWhite', 4, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('559TN0377', 'FireBrick', 'ysv-38', 250, 'Lime', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('358TN1938', 'MidnightBlue', 'pat-38', 180, 'BlanchedAlmond', 6, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('278TN3059', 'DarkSalmon', 'yen-45', 280, 'Yellow', 6, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('517TN6880', 'DeepSkyBlue', 'slo-19', 210, 'Gray', 6, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('723TN1631', 'LightYellow', 'uod-87', 180, 'Yellow', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('227TN9647', 'SpringGreen', 'gfy-12', 210, 'NavajoWhite', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('813TN5487', 'LimeGreen', 'tnc-59', 180, 'Brown', 4, 'Diesel', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('262TN3569', 'SlateGrey', 'ngn-58', 300, 'Moccasin', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('744TN4809', 'Maroon', 'syf-31', 280, 'HotPink', 6, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('667TN8145', 'Gray', 'wdv-99', 180, 'Linen', 4, 'Oil', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('720TN9492', 'AntiqueWhite', 'tbv-14', 180, 'Tan', 4, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('036TN9327', 'LimeGreen', 'blu-05', 280, 'BlanchedAlmond', 6, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('988TN7448', 'BlueViolet', 'pxn-84', 280, 'HotPink', 6, 'Gaz', '');
INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) VALUES ('620TN8078', 'ForestGreen', 'wbo-34', 280, 'Magenta', 4, 'Gaz', '');


