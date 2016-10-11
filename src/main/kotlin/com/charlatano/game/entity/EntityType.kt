/*
 * Charlatano is a premium CS:GO cheat ran on the JVM.
 * Copyright (C) 2016 - Thomas Nappo), Jonathan Beaudoin
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation), either version 3 of the License), or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful),
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not), see <http://www.gnu.org/licenses/>.
 */

package com.charlatano.game.entity

import com.charlatano.game.CSGO.csgoEXE
import org.jire.arrowhead.unsign

enum class EntityType(val id: Long, val weapon: Boolean = false, val grenade: Boolean = false) {

	NULL(-1),

	NextBotCombatCharacter(0),
	CAK47(1, weapon = true),
	CBaseAnimating(2),
	CBaseAnimatingOverlay(3),
	CBaseAttributableItem(4),
	CBaseButton(5),
	CBaseCombatCharacter(6),
	CBaseCombatWeapon(7),
	CBaseCSGrenade(8, grenade = true),
	CBaseCSGrenadeProjectile(9, grenade = true),
	CBaseDoor(10),
	CBaseEntity(11),
	CBaseFlex(12),
	CBaseGrenade(13),
	CBaseParticleEntity(14),
	CBasePlayer(15),
	CBasePropDoor(16),
	CBaseTeamObjectiveResource(17),
	CBaseTempEntity(18),
	CBaseToggle(19),
	CBaseTrigger(20),
	CBaseViewModel(21),
	CBaseVPhysicsTrigger(22),
	CBaseWeaponWorldModel(23),
	CBeam(24),
	CBeamSpotlight(25),
	CBoneFollower(26),
	CBreakableProp(27),
	CBreakableSurface(28),
	CC4(29),
	CCascadeLight(30),
	CChicken(31),
	CColorCorrection(32),
	CColorCorrectionVolume(33),
	CCSGameRulesProxy(34),
	CCSPlayer(35),
	CCSPlayerResource(36),
	CCSRagdoll(37),
	CCSTeam(38),
	CDEagle(39, weapon = true),
	CDecoyGrenade(40, grenade = true),
	CDecoyProjectile(41, grenade = true),
	CDynamicLight(42),
	CDynamicProp(43),
	CEconEntity(44),
	CEmbers(45),
	CEntityDissolve(46),
	CEntityFlame(47),
	CEntityFreezing(48),
	CEntityParticleTrail(49),
	CEnvAmbientLight(50),
	CEnvDetailController(51),
	CEnvDOFController(52),
	CEnvParticleScript(53),
	CEnvProjectedTexture(54),
	CEnvQuadraticBeam(55),
	CEnvScreenEffect(56),
	CEnvScreenOverlay(57),
	CEnvTonemapController(58),
	CEnvWind(59),
	CFEPlayerDecal(60),
	CFireCrackerBlast(61),
	CFireSmoke(62),
	CFireTrail(63),
	CFish(64),
	CFlashbang(65, grenade = true),
	CFogController(66),
	CFootstepControl(67),
	CFunc_Dust(68),
	CFunc_LOD(69),
	CFuncAreaPortalWindow(70),
	CFuncBrush(71),
	CFuncConveyor(72),
	CFuncLadder(73),
	CFuncMonitor(74),
	CFuncMoveLinear(75),
	CFuncOccluder(76),
	CFuncReflectiveGlass(77),
	CFuncRotating(78),
	CFuncSmokeVolume(79),
	CFuncTrackTrain(80),
	CGameRulesProxy(81),
	CHandleTest(82),
	CHEGrenade(83, grenade = true),
	CHostage(84),
	CHostageCarriableProp(85),
	CIncendiaryGrenade(86, grenade = true),
	CInferno(87),
	CInfoLadderDismount(88),
	CInfoOverlayAccessor(89),
	CItem_Healthshot(90),
	CKnife(91),
	CKnifeGG(92),
	CLightGlow(93),
	CMaterialModifyControl(94),
	CMolotovGrenade(95, grenade = true),
	CMolotovProjectile(96, grenade = true),
	CMovieDisplay(97),
	CParticleFire(98),
	CParticlePerformanceMonitor(99),
	CParticleSystem(100),
	CPhysBox(101),
	CPhysBoxMultiplayer(102),
	CPhysicsProp(103),
	CPhysicsPropMultiplayer(104),
	CPhysMagnet(105),
	CPlantedC4(106),
	CPlasma(107),
	CPlayerResource(108),
	CPointCamera(109),
	CPointCommentaryNode(110),
	CPoseController(111),
	CPostProcessController(112),
	CPrecipitation(113),
	CPrecipitationBlocker(114),
	CPredictedViewModel(115),
	CProp_Hallucination(116),
	CPropDoorRotating(117),
	CPropJeep(118),
	CPropVehicleDriveable(119),
	CRagdollManager(120),
	CRagdollProp(121),
	CRagdollPropAttached(122),
	CRopeKeyframe(123),
	CSCAR17(124, weapon = true),
	CSceneEntity(125),
	CSensorGrenade(126),
	CSensorGrenadeProjectile(127),
	CShadowControl(128),
	CSlideshowDisplay(129),
	CSmokeGrenade(130, grenade = true),
	CSmokeGrenadeProjectile(131, grenade = true),
	CSmokeStack(132),
	CSpatialEntity(133),
	CSpotlightEnd(134),
	CSprite(135),
	CSpriteOriented(136),
	CSpriteTrail(137),
	CStatueProp(138),
	CSteamJet(139),
	CSun(140),
	CSunlightShadowControl(141),
	CTeam(142),
	CTeamplayRoundBasedRulesProxy(143),
	CTEArmorRicochet(144),
	CTEBaseBeam(145),
	CTEBeamEntPoint(146),
	CTEBeamEnts(147),
	CTEBeamFollow(148),
	CTEBeamLaser(149),
	CTEBeamPoints(150),
	CTEBeamRing(151),
	CTEBeamRingPoint(152),
	CTEBeamSpline(153),
	CTEBloodSprite(154),
	CTEBloodStream(155),
	CTEBreakModel(156),
	CTEBSPDecal(157),
	CTEBubbles(158),
	CTEBubbleTrail(159),
	CTEClientProjectile(160),
	CTEDecal(161),
	CTEDust(162),
	CTEDynamicLight(163),
	CTEEffectDispatch(164),
	CTEEnergySplash(165),
	CTEExplosion(166),
	CTEFireBullets(167),
	CTEFizz(168),
	CTEFootprintDecal(169),
	CTEFoundryHelpers(170),
	CTEGaussExplosion(171),
	CTEGlowSprite(172),
	CTEImpact(173),
	CTEKillPlayerAttachments(174),
	CTELargeFunnel(175),
	CTEMetalSparks(176),
	CTEMuzzleFlash(177),
	CTEParticleSystem(178),
	CTEPhysicsProp(179),
	CTEPlantBomb(180),
	CTEPlayerAnimEvent(181),
	CTEPlayerDecal(182),
	CTEProjectedDecal(183),
	CTERadioIcon(184),
	CTEShatterSurface(185),
	CTEShowLine(186),
	CTesla(187),
	CTESmoke(188),
	CTESparks(189),
	CTESprite(190),
	CTESpriteSpray(191),
	CTest_ProxyToggle_Networkable(192),
	CTestTraceline(193),
	CTEWorldDecal(194),
	CTriggerPlayerMovement(195),
	CTriggerSoundOperator(196),
	CVGuiScreen(197),
	CVoteController(198),
	CWaterBullet(199),
	CWaterLODControl(200),
	CWeaponAug(201, weapon = true),
	CWeaponAWP(202, weapon = true),
	CWeaponBaseItem(203),
	CWeaponBizon(204, weapon = true),
	CWeaponCSBase(205),
	CWeaponCSBaseGun(206),
	CWeaponCycler(207),
	CWeaponElite(208, weapon = true),
	CWeaponFamas(209, weapon = true),
	CWeaponFiveSeven(210, weapon = true),
	CWeaponG3SG1(211, weapon = true),
	CWeaponGalil(212, weapon = true),
	CWeaponGalilAR(213, weapon = true),
	CWeaponGlock(214, weapon = true),
	CWeaponHKP2000(215, weapon = true),
	CWeaponM249(216, weapon = true),
	CWeaponM3(217, weapon = true),
	CWeaponM4A1(218, weapon = true),
	CWeaponMAC10(219, weapon = true),
	CWeaponMag7(220, weapon = true),
	CWeaponMP5Navy(221, weapon = true),
	CWeaponMP7(222, weapon = true),
	CWeaponMP9(223, weapon = true),
	CWeaponNegev(224, weapon = true),
	CWeaponNOVA(225, weapon = true),
	CWeaponP228(226, weapon = true),
	CWeaponP250(227, weapon = true),
	CWeaponP90(228, weapon = true),
	CWeaponSawedoff(229, weapon = true),
	CWeaponSCAR20(230, weapon = true),
	CWeaponScout(231, weapon = true),
	CWeaponSG550(232, weapon = true),
	CWeaponSG552(233, weapon = true),
	CWeaponSG556(234, weapon = true),
	CWeaponSSG08(235, weapon = true),
	CWeaponTaser(236),
	CWeaponTec9(237, weapon = true),
	CWeaponTMP(238, weapon = true),
	CWeaponUMP45(239, weapon = true),
	CWeaponUSP(240, weapon = true),
	CWeaponXM1014(241, weapon = true),
	CWorld(242),
	DustTrail(243),
	MovieExplosion(244),
	ParticleSmokeGrenade(245, grenade = true),
	RocketTrail(246),
	SmokeTrail(247),
	SporeExplosion(248),
	SporeTrail(249);

	companion object {

		val cachedValues = values()

		val size = cachedValues.size

		fun byID(id: Long) = cachedValues.firstOrNull { it.id == id }

		fun byEntityAddress(address: Long): EntityType {
			val vt = (csgoEXE.read(address + 0x8, 4) ?: return NULL).getInt(0).unsign()
			val fn = (csgoEXE.read(vt + 2 * 0x4, 4) ?: return NULL).getInt(0).unsign()
			val cls = (csgoEXE.read(fn + 0x1, 4) ?: return NULL).getInt(0).unsign()
			val clsid = (csgoEXE.read(cls + 20, 4) ?: return NULL).getInt(0).unsign()
			return byID(clsid) ?: NULL
		}

	}

}