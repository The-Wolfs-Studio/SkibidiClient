package net.lax1dude.eaglercraft.v1_8;

import java.math.BigInteger;

import net.lax1dude.eaglercraft.v1_8.internal.PlatformRuntime;

import static net.eaglerforge.api.ModLoader.returntotalloadedmods;

public class EaglercraftVersion {
	
	
	//////////////////////////////////////////////////////////////////////
	
	/// Customize these to fit your fork:

	//Client name (Shadow)
	public static final String projectForkName = new String(new byte[] {83, 104, 97, 100, 111, 119 });
	//Build version (number + snapshot/official)
	public static final String projectForkVersion = new String(new byte[] {52, 46, 53, 32, 115, 110, 97, 112, 115, 104, 111, 116, 45, 50, 52, 119, 50, 56, 97 });
	//Author name (PeytonPlayz585)
	public static final String projectForkVendor = new String(new byte[] {80, 101, 121, 116, 111, 110, 80, 108, 97, 121, 122, 53, 56, 53 });

	public static final String projectForkURL = "https://gitlab.com/lax1dude/eaglercraftx-1.8";

	//////////////////////////////////////////////////////////////////////
	
	//Client name (Shadow)
	public static final String projectOriginName = new String(new byte[] {83, 104, 97, 100, 111, 119 });
	public static final String projectOriginAuthor = "lax1dude";
	public static final String projectOriginRevision = projectForkVersion;
	public static final String projectOriginVersion = "(u34)";
	
	public static final String projectOriginURL = "https://gitlab.com/lax1dude/eaglercraftx-1.8"; // rest in peace
	
	
	
	// Updating configuration
	
	public static final boolean enableUpdateService = false;

	public static final String updateBundlePackageName = "net.lax1dude.eaglercraft.v1_8.client";
	public static final int updateBundlePackageVersionInt = 34;

	public static final String updateLatestLocalStorageKey = "latestUpdate_" + updateBundlePackageName;

	// public key modulus for official 1.8 updates
	public static final BigInteger updateSignatureModulus = new BigInteger("14419476194820052109078379102436982757438300194194974078260570958862225232043861026588258585967060437391326494976080031137298500457111529693806931143421725626747051503616606418909609840275122831550688481329699012469742002429706330734797679859799085213517354399295425740214330234086361416936984593337389989505613123225737002654977194421571825036717017788527234114501215218715499682638139386636103589791643964827904791195488978835113700772208317974307363542114867750505953323167521731238542123593257269990619007858952216110012513121779359926747737258698347806747854986471035713105133999027704095451858121831297923962641");
	
	
	// Miscellaneous variables:

	public static final String mainMenuStringB = projectOriginName + " " +
			projectOriginRevision + " " + projectOriginVersion;
	public static final String mainMenuStringC = "";
	public static final String mainMenuStringD = "Resources Copyright Mojang AB";

	public static final String mainMenuStringE = projectForkName + " " + projectForkVersion;
	public static final String mainMenuStringF = "Made by " + projectForkVendor;

	public static final String mainMenuStringG = projectForkVersion;
	public static final String mainMenuStringH = new String(new byte[] {83, 105, 110, 103, 108, 101, 112, 108, 97, 121, 101, 114, 32, 43, 32, 79, 112, 116, 105, 102, 105, 110, 101 });

	public static final long demoWorldSeed = (long) "North Carolina".hashCode();

	public static final boolean mainMenuEnableGithubButton = true;

	public static final boolean forceDemoMode = false;
	
	public static final String localStorageNamespace = "_eaglercraftX";
	
	public static String getMainMenuStringA() {
		int loadedmods = returntotalloadedmods();
		String mainMenuStringA = "Minecraft 1.8.8";
		if(!PlatformRuntime.isDebugRuntime()) {
			if(loadedmods == 1) {
				mainMenuStringA = mainMenuStringA + " (" + loadedmods + " Mod loaded)";
			} else {
				mainMenuStringA = mainMenuStringA + " (" + loadedmods + " Mods loaded)";
			}
		}
		
		return mainMenuStringA;
	}

}
